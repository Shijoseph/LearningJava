package conditionalstatment;

public class IssueDriversLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageofDriver1 = 10;

		String driver1LicenseType = "G2";

		String licenseType1 = "G1";
		String licenseType2 = "G2";
		String licenseType3 = "G";

		if (ageofDriver1 >= 16 && ageofDriver1 <= 100)
		{
			if (driver1LicenseType == licenseType1) {
				System.out.println("license will be issued to driver 1");
				System.out.println("type of license issued will be " + driver1LicenseType);

			}
			if (driver1LicenseType == licenseType2) {
				System.out.println("license will be issued to driver 1");
				System.out.println("type of license issued will be " + driver1LicenseType);
			}
			if (driver1LicenseType == licenseType3) {
				System.out.println("license will be issued to driver 1");
				System.out.println("type of license issued will be " + driver1LicenseType);
			}
			
		}else 
			
		{System.out.println("driver1 is not eligble for license due to age limt");
		

	}
}}
