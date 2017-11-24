package example.jvmspace;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

public class CreatClass {
	static int count;
	public static void main(String[] args) {
		while(true) {
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(SampleClass.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(new FixedValue() {
				@Override
				public Object loadObject() throws Exception {
					return "instance" + ++count;
				}
			});
			SampleClass proxy = (SampleClass) enhancer.create();
			System.out.println("Class Name:" + proxy.getClass().toString() + ".Current instance count: " + proxy.toString());
		}
	}
}
class SampleClass {}