package Technicalities.tech0_packageAndMemberAccessCases.pkgPLA.pack;

class PLAClass //pla level class
{
	// public members
	public int pub = 9;
	public void instancePublic()
	{
		System.out.println("inside public member");
	}
	public static void staticPublic()
	{
		System.out.println("inside static public member");
	}

	// protected members
	protected int pro = 91;
	protected void instanceProtected()
	{
		System.out.println("inside protected member");
	}
	protected static void staticProtected()
	{
		System.out.println("inside static protected member");
	}

	// PLA access members
	int pla = 911;
	void instancePLA()
	{
		System.out.println("inside PLA member");
	}
	static void staticPLA()
	{
		System.out.println("inside static PLA member");
	}

	// private members
	private int priv = 9112;
	private void instancePrivate()
	{
		System.out.println("inside private member");
	}
	private static void staticPrivate()
	{
		System.out.println("inside static private member");
	}
};
