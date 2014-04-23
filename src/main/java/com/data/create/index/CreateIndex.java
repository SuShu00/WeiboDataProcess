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
			LOG.error("创建目录失败");
		} 
		config = new IndexWriterConfig(Version.LUCENE_45,analyzer);
		try {
			indexWriter = new IndexWriter(dir,config);
		} catch (IOException e) {
			LOG.error("indexWriter建立失败" + e.getMessage());
		}
	}
	
	/**
	 * 创建indexWriter对象
	 */
	public void createIndexWriter(){
		try {
			indexWriter = new IndexWriter(dir,config);
		} catch (IOException e) {
			LOG.error("indexWriter建立失败" + e.getMessage());
		}
		setIndexWriter(indexWriter);
	}
	
	/**
	 * 建立索引
	 * @param document
	 */
	public void createIndex(Document document){

		try {
			indexWriter.addDocument(document);
		} catch (IOException e) {
			LOG.error("document加入失败" + e.getMessage());
		}
	}
	
	/**
	 * 提交索引
	 */
	public void commit(){
		try {
			indexWriter.commit();
			LOG.info("索引提交成功");
		} catch (IOException e) {
			LOG.error("提交索引失败" + e.getMessage());
		}
	}
	
	/**
	 * 优化索引
	 */
	public void optimize(){
		try {
			indexWriter.forceMerge(1);
			LOG.info("优化索引成功");
		} catch (IOException e) {
			LOG.error("索引优化失败" + e.getMessage());
		}
	} 
	
	/**
	 * 关闭IndexWrtier对象
	 */
	public void close(){
		try {
			indexWriter.close();
			LOG.info("indexWriter关闭成功");
		} catch (IOException e) {
			LOG.error("indexWriter关闭失败" + e.getMessage());
		}
	}
}
