package com.data.create.index;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
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
	static{
		analyzer = new SkyLightAnalyzer(Version.LUCENE_45);
		try {
			dir=FSDirectory.open(new File(StaticValue.INDEX_PATH));
		} catch (IOException e) {
			LOG.error("索引目录建立失败" + e.getMessage());
		} 
	}
	
	/**
	 * 建立索引
	 * @param document
	 */
	public void createIndex(Document document){
		IndexWriterConfig config=new IndexWriterConfig(Version.LUCENE_45,analyzer);
		IndexWriter indexWriter = null;
		try {
			indexWriter = new IndexWriter(dir,config);
		} catch (IOException e) {
			LOG.error("indexWriter建立失败" + e.getMessage());
		}
		try {
			indexWriter.addDocument(document);
		} catch (IOException e) {
			LOG.error("document加入失败" + e.getMessage());
		}
		try {
			indexWriter.close();
		} catch (IOException e) {
			LOG.info("indexWriter关闭失败" + e.getMessage());
		}
	}
}
