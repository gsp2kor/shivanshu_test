package com.test.threadpool;

import java.util.ArrayList;
import java.util.List;


public class ThreadPool {

	private BlockingQueue taskQueue = null;
	
	private List<PoolThread> threads = new ArrayList<PoolThread>();
	private boolean isStopped = false;
	
	public synchronized void  execute(Runnable task) throws Exception{
        if(this.isStopped) throw
            new IllegalStateException("ThreadPool is stopped");

        this.taskQueue.enqueue(task);
    }

    public synchronized void stop(){
        this.isStopped = true;
        for(PoolThread thread : threads){
           thread.stop();
        }
    }
	
	
}
