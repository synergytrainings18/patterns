package Adapter.api.client;

import Adapter.api.api.HttpServlet;

import java.util.List;

public class HttpServletAdapter extends EntityCrud implements HttpServlet {

    @Override
    public List<Object> doGet() {
        return getAllDate();
    }

    @Override
    public void doPost(List<Object> list) {
        addData(list);
    }

    @Override
    public void doPut(List<Object> list) {
        updateData(list);
    }

    @Override
    public void doDelete(List<Object> list) {
        removeDate(list);
    }
}
