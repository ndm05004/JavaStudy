package chapter10;

import java.util.Objects;

public class Member {

	public String id;

	public Member(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	
	}

	/*	 * @Override public boolean equals(Object obj) { if(super.equals(obj)) { return
	 * true; } if(!(obj instanceof Member)) { return false; } Member member =
	 * (Member) obj; return id.equals(member.id); }
	 */
}
