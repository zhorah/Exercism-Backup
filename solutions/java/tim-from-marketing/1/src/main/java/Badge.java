class Badge {
    public String print(Integer id, String name, String department) {
        //throw new UnsupportedOperationException("Please implement the Badge.print() method");
        if (department == null) {
            department = "owner";
        }
        if (id == null) {
            return name + " - " + department.toUpperCase();
        }
        return "[" + id + "] - " + name + " - " + department.toUpperCase();
    }
}
