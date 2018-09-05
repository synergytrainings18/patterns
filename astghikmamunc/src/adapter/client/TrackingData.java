package adapter.client;

/**
 * Created by astghik.mamunc on 9/5/2018.
 */
public class TrackingData {

	private String insertedData;

	private String updatedData;

	private String deletedData;

	public String getInsertedData() {
		return insertedData;
	}

	public void setInsertedData(String insertedData) {
		this.insertedData = insertedData;
	}

	public String getUpdatedData() {
		return updatedData;
	}

	public void setUpdatedData(String updatedData) {
		this.updatedData = updatedData;
	}

	public String getDeletedData() {
		return deletedData;
	}

	public void setDeletedData(String deletedData) {
		this.deletedData = deletedData;
	}
}
