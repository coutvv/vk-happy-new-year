package ru.coutvv.vkhny.util;

import java.util.Random;

public class LagUtil {

	private static final long TIMEOUT = 500;
	private static final Random rand = new Random();
	/**
	 * Задержка 500+-250 sec
	 */
	public static void lag() {
		try { //waiting
			long dtime = rand.nextInt(250);
			dtime = (rand.nextBoolean() ? dtime : -dtime);//warious time
			Thread.sleep(TIMEOUT + dtime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void lag(long timeout) {
		try { //waiting
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
