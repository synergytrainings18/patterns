package factory.api;

import factory.User;

import java.util.List;
import java.util.Map;

/**
 * Created by astghik.mamunc on 8/10/2018.
 */
public class Notification {

	private Integer entityId;

	private List<User> toReceivers;

	private List<User> ccReceivers;

	private Map<String, String> notificationParams;

	public Notification(List<User> toReceivers, List<User> ccReceivers, Integer entityId, Map<String, String> notificationParams) {
		this.toReceivers = toReceivers;
		this.ccReceivers = ccReceivers;
		this.entityId = entityId;
		this.notificationParams = notificationParams;
	}

	public List<User> getToReceivers() {
		return toReceivers;
	}

	public void setToReceivers(List<User> toReceivers) {
		this.toReceivers = toReceivers;
	}

	public List<User> getCcReceivers() {
		return ccReceivers;
	}

	public void setCcReceivers(List<User> ccReceivers) {
		this.ccReceivers = ccReceivers;
	}

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public Map<String, String> getNotificationParams() {
		return notificationParams;
	}

	public void setNotificationParams(Map<String, String> notificationParams) {
		this.notificationParams = notificationParams;
	}
}
