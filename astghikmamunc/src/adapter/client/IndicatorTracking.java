package adapter.client;

import java.util.Map;

/**
 * Created by astghik.mamunc on 9/5/2018.
 */
public class IndicatorTracking {

	private Map<String, Object> updatedData;

	private Map<String, Object> insertedData;

	private Map<String, Object> deletedData;

	public Map<String, Object> getUpdatedData() {
		return updatedData;
	}

	public void setUpdatedData(Map<String, Object> updatedData) {
		this.updatedData = updatedData;
	}

	public Map<String, Object> getInsertedData() {
		return insertedData;
	}

	public void setInsertedData(Map<String, Object> insertedData) {
		this.insertedData = insertedData;
	}

	public Map<String, Object> getDeletedData() {
		return deletedData;
	}

	public void setDeletedData(Map<String, Object> deletedData) {
		this.deletedData = deletedData;
	}
}
