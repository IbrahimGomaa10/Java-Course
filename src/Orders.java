import java.util.UUID;

public class Orders {
    private String id;
    private String store;
    private String user;
    private Status status;

    public Orders() {}

    public Orders(String store, String user) {
        this.id = UUID.randomUUID().toString();
        this.store = store;
        this.user = user;
        this.status = Status.PENDING;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void updateStatus(Status newStatus) {
        this.status = newStatus;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", store='" + store + '\'' +
                ", user='" + user + '\'' +
                ", status=" + status +
                '}';
    }
}
