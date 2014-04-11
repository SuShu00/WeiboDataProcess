package com.data.create.index;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import com.data.commons.utils.StaticValue;
import com.zel.core.analyzer.lucene.SkyLightAnalyzer;

/**
 * 数据创建索引
 * @author Shu
 */
public class CreateIndex {
	private static Logger LOG = Logger.getLogger(CreateIndex.class);
	private static Analyzer analyzer = null; 
	private static Directory dir = null; 
	private static IndexWriterConfig config = null;
	private static IndexWriter indexWriter = null;  
	public static IndexWriter getIndexWriter() {
		return indexWriter;
	}

	public static void setIndexWriter(IndexWriter indexWriter) {
		CreateIndex.indexWriter = indexWriter;
	}
	static{
		analyzer = new SkyLightAnalyzer(Version.LUCENE_45);
		try {
			dir=FSDirectory.open(new File(StaticValue.INDEX_PATH));
		} catch (IOException e) {
		} 
		config = new IndexWriterConfig(Version.LUCENE_45,analyzer);
		try {
			indexWriter = new IndexWriter(dir,config);
		} catch (IOException e) {
			LOG.error("indexWriter建立失败" + e.getMessage());
		}
	}
	
	/**
	 * 建立索引
	 * @param document
	 */
	public void createIndex(IndexWriter indexWriter, Document document){

		try {
			indexWriter.addDocument(document);
		} catch (IOException e) {
			LOG.error("document加入失败" + e.getMessage());
		}
		try {
			indexWriter.commit();
		} catch (IOException e) {
			LOG.info("indexWriter提交失败" + e.getMessage());
		}
	}
}
