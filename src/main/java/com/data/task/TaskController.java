package com.data.task;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.log4j.Logger;

import com.data.dao.impl.WeiboDAOImpl;

/**
 * 任务队列控制器
 * @author Shu
 *
 */
public class TaskController {
	private Logger LOG = Logger.getLogger(TaskController.class);
	private LinkedBlockingQueue<String> queue;
	private boolean isInit = false;
	private WeiboDAOImpl weiboDao;
	
	public TaskController(){
		queue = new LinkedBlockingQueue<String>();	
		weiboDao = new WeiboDAOImpl();
	}
	
	/**
	 * 清空队列
	 */
	public void clearQueue(){
		queue.clear();
	}
	
	/**
	 * 探测队列是否为空
	 * @return
	 */
	public synchronized boolean isQueueEmpty(){
		return queue.isEmpty();
		
	}
	
	/**
	 * 从队列中获取Task任务
	 * @return
	 * @throws Exception:如果TaskController没有初始化抛出此异常
	 */
	public String takeTask() throws Exception{
		String task = null;
		if (!isInit) {
            LOG.fatal("TaskController尚未初始化,请执行init方法然后使用");
            throw new Exception("TaskController尚未初始化,请执行init方法然后使用");
        }else{
        	try {
                task = queue.take();
            } catch (InterruptedException e) {
                LOG.info(e.getMessage());
                LOG.info("等待时被中断");
            }
        }
        return task;
	}
	
	/**
	 * 初始化TaskController，把要处理的Task加入到队列中
	 */
	public void init(){
		LOG.info("正在初始化任务队列");
		int index = 0;
		for (String uid : weiboDao.listWeiboId()) {
            try {
				queue.put(uid);
				
			} catch (InterruptedException e) {
				LOG.error("任务加入失败");
			}
            LOG.info("第" + index + "个任务队列初始化成功");
            index++;
        }
		this.isInit = true;
	}

}
