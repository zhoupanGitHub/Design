package com.zhoup.design;
/**
 * 单例模式---饿汉式
 * @ClassName:Singleton
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: ZHOUPAN
 * @date 2019年2月13日 下午1:52:31
 *
 * @Copyright: 2018 www.zsplat.com Inc. All rights reserved.
 */
public class HungrySingleton {
	//1.指向自己实例的私有静态引用
	private static HungrySingleton singleton = new HungrySingleton();
	//2.私有的构造方法
	private HungrySingleton(){};
	//3.以自己实例为返回值的静态的公有的方法
	public static HungrySingleton getInstance(){
		return singleton;
	}
}
