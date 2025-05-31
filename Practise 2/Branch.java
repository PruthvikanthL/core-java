class Branch{
static String[] Branchnames={null,null,null};
static int index=0;
 public static void addbranch(String branchname) {
    if (branchname != null) {
        if (index < Branchnames.length) {
            Branchnames[index] = branchname;
            System.out.println("Branch name added to array successfully");
            index++;

            for (int i = 0; i < Branchnames.length; i++) {
                System.out.println("The Element added to array at index " + i + " is " + Branchnames[i]);
            }
        } else {
            System.out.println("Array is full, we can't add more branches.\n");
        }
    } else {
        System.out.println("Branch name is null, cannot add.\n");
    }
}

 public static void searcher(int i) {
    if (i >= 0 && i < Branchnames.length) {
        System.out.println("The value at index " + i + " is " + Branchnames[i]);
    } else {
        System.out.println("Invalid index. Please enter a valid index.\n");
    }
}
