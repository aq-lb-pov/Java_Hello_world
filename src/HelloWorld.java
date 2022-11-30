class HelloWorld {
    public static void main (String[] args) {
        Secret secret = new Secret();
        secret.Password = "newpassword";
        System.out.println(secret.getPassword());
        System.out.println(secret.User());
        System.out.println("Hello World");
    }
}
