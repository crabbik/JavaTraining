package string;

public enum TransactionStatus {

	opened("�������"), closed("�������"), cancelled("��������");

	String nameRu;

	TransactionStatus(String nameRu) {
		this.nameRu = nameRu;

	}

	public String getNameRu() {
		return nameRu;
	}

	public void setNameRu(String nameRu) {
		this.nameRu = nameRu;
	}

}
