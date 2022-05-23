package conditionalstatment;

public class AndOperatorInBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalRequiredMark = 550;
		int obtainedMarkCand1 = 560;
		int obtainedMarkCand2 = 200;
		
		int marksRequiredinBio = 110;
		int marksObtainedBioCand1 = 110;
		int marksObtainedBioCand2 = 10;
		
		boolean ifTotalMarksSuffCand1 = obtainedMarkCand1 >= totalRequiredMark;
		boolean ifTotalMarksSuffCand2 = obtainedMarkCand2 >= totalRequiredMark;
		
		boolean ifbioMarksSuffCand1 = marksObtainedBioCand1 >= marksRequiredinBio;
		boolean ifbioMarksSuffCand2 = marksObtainedBioCand2 >= marksRequiredinBio;
		
		boolean isCand1Eligible = ifbioMarksSuffCand1 && ifTotalMarksSuffCand1;
		boolean isCand2Eligible = ifbioMarksSuffCand2 && ifTotalMarksSuffCand2;
		
		System.out.println("Candidate 1 is elgible  "+isCand1Eligible);
		System.out.println("Canadidate 2 is eligible  "+isCand2Eligible);
		
		
		
	}

}
