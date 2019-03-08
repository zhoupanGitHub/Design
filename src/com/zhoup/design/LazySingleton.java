package com.zhoup.design;

/**
 * 单例模式---懒汉式
 * @ClassName:LazySingleton
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: ZHOUPAN
 * @date 2019年2月13日 下午2:12:19
 *
 * @Copyright: 2018 www.zsplat.com Inc. All rights reserved.
 */
public class LazySingleton {
	// 保证 instance在所有线程中同步
	private static volatile LazySingleton instance = null;

	// private 避免类在外部被实例化
	private LazySingleton() {
	}

	// getInstance 方法前加同步
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
