package Adapter.api.api;

import java.util.List;

public interface HttpServlet {

    public List<Object> doGet();
    public void doPost(List<Object> list);
    public void doPut(List<Object> list);
    public void doDelete(List<Object> list);
}
