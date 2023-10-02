package override;

public class CellEx {

	public static void main(String[] args) {
		
		AndroidCell android = new AndroidCell();
		android.On();
		android.Off();
		
		AppleCell apple = new AppleCell();
		apple.On();
		apple.Off();
	}

}
