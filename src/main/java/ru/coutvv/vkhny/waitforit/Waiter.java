package ru.coutvv.vkhny.waitforit;

import ru.coutvv.vkhny.util.LagUtil;

public class Waiter implements Runnable {
	
	public Waiter(WhatWait condition) {
		waitCondition = condition;
	}
	private WhatWait waitCondition;
	
	private static final long WAIT_TIME = 1*60*1000;
	@Override
	public void run() {
		boolean done = false;
		while(!done) {
			if(waitCondition.isItTime()) {
				waitCondition.doIt();
				done = true;
				break;
			}
			LagUtil.lag(WAIT_TIME);
		}
	}
	
}
