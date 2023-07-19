package orange_hrm_pages;

public class Main {

	public static void main(String[] args) throws Exception 
	{
		 Test_cases.navigate_to_the_application_Tc_01();
		 Test_cases .Valid_Credentials_Tc_02();
		 Test_cases .invalid_Credentials_Tc_03();
		 Test_cases .valid_userName_and_invalid_pswd_Tc_04();
		 Test_cases .invalid_user_valid_pswd_Tc_05();
		 Test_cases .empty_user_valid_pswd_Tc_06();
		 Test_cases .valid_user_empty_pswd_txbox_Tc_07();
		 Test_cases .empty_user_txbox_empty_pswd_Tc_08();
		 
	}

}
