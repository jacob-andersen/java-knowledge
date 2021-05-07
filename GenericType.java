public class GenericType <T>{
    private T genericType;

    GenericType() {}

    GenericType (T type) {
        genericType = type;
    }

    public T getType () {
        return genericType;
    }

    public void setType(T type) {
        genericType = type;
    }
}
