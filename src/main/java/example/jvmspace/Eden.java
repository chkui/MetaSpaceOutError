package example.jvmspace;

public class Eden {
	private static final int _1MB = 1024 * 1024;
	public static void main(String[] args) {
		byte[] allocat1, allocat2, allocat3, allocat4;
		allocat1 = new byte[2 * _1MB];
		allocat2 = new byte[2 * _1MB];
		allocat3 = new byte[2 * _1MB];
		allocat4 = new byte[2 * _1MB];
	}
}
