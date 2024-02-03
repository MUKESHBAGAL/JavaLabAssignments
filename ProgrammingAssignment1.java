class SY2022bit039 {
    public int getValidRegistrationsCount(String[] enrollments) {
        if (enrollments == null) {
            return -1;
        }

        int count = 0;

        for (String enrollment : enrollments) {
            if (isValidEnrollment(enrollment)) {
                count++;
            }
        }

        return count;
    }

    private boolean isValidEnrollment(String enrollment) {
        if (enrollment == null || enrollment.length() != 10) {
            return false;
        }

        int year = Integer.parseInt(enrollment.substring(0, 4));

        if (year < 2000 || year >= 2024) {
            return false;
        }

        String departmentId = enrollment.substring(4, 7);

        return departmentId.equalsIgnoreCase("bit")
                || departmentId.equalsIgnoreCase("bcs")
                || departmentId.equalsIgnoreCase("bme")
                || departmentId.equalsIgnoreCase("bch");
    }

    public static void main(String[] args) {
        String[] enrollments = { null, "2022Bit039", "2000bit039", "2025bcs039" };
        SY2022bit039 data = new SY2022bit039();
        int count = data.getValidRegistrationsCount(enrollments);
        System.out.println(count);
    }
}
