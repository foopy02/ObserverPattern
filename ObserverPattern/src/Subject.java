public interface Subject {
    void registerUser(Observer user);
    void removeUser(Observer user);
    void notifyAllUsers();
}
