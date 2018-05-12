class Accounts {

	public static void main(String[] args) {
		String adachiAccountName    = "安達くん";		// �����N�̌������`
		String adachiAccountNo      = "123456";		// �@�V�@�̌����ԍ�
		long   adachiAccountBalance = 1000;				// �@�V�@�̗a��c��

		String nakataAccountName    = "中田くん";		// ���c�N�̌������`
		String nakataAccountNo      = "654321";		// �@�V�@�̌����ԍ�
		long   nakataAccountBalance = 200;				// �@�V�@�̗a��c��

		adachiAccountBalance -= 200;						// �����N��200�~���낷
		nakataAccountBalance += 100;						// ���c�N��100�~�a����

		System.out.println("安達くんの口座");
		System.out.println("口座名義" + adachiAccountName);
		System.out.println("口座番号" + adachiAccountNo);
		System.out.println("預金残高" + adachiAccountBalance);

		System.out.println("中田くんの口座");
		System.out.println("口座名義" + nakataAccountName);
		System.out.println("口座番号" + nakataAccountNo);
		System.out.println("預金残高" + nakataAccountBalance);
	}
}
