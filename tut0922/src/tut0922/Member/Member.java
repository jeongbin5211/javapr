package tut0922.Member;

public class Member {
	// ȸ����ȣ, ȸ���� : �⺻Ű(���� �ߺ��Ǹ� �ȵ�) : primary key <=> Foreign key
	// ����, �˻�
	
	// �ʵ�
	private int memberID;
	private String memberName;
	
	// ������
	public Member() {}
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	
	// getter, setter
	
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "ȸ�����̵� : " + memberID + ", ȸ���̸� : " + memberName;
	}
	
}
