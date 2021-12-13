package ua.goit.http;

import user.Address;
import user.Company;
import user.Geo;
import user.User;

import java.io.IOException;
import java.net.URI;

public class Http {
    private final static String CREATE_USER_URL = "https://jsonplaceholder.typicode.com/users";

    public static void main(String[] args) throws IOException, InterruptedException {
        User user = createDefaultUser();
        final User createdUser = HttpUtil.createUser(URI.create(CREATE_USER_URL), user);
        System.out.println(createdUser);

        //System.out.println(HttpUtil.getUserInfoId(2));
        //System.out.println(HttpUtil.updateUser(1, user));
        //System.out.println(HttpUtil.deleteUser(user));
        //System.out.println(HttpUtil.getUserName("Leanne Graham"));
        //System.out.println(HttpUtil.getAllUsers());
        //System.out.println(HttpUtil.getAllCommit(user));
        //System.out.println(HttpUtil.getListTaskUser(user));
    }

    private static User createDefaultUser() {
        User user = new User();
        user.setName("Alex");
        user.setId(1);
        user.setUsername("Pritov");
        user.setEmail("Al@ukr.net");
        user.setAddress(crateDefaultAddress());
        user.setPhone("111-11-11");
        user.setWebsite("www.progyt.org.ua");
        user.setCompany(createDefaultCompany());
        return user;
    }

    private static Address crateDefaultAddress() {
        Address address = new Address();
        address.setStreet("street");
        address.setSuite("10");
        address.setCity("Country");
        address.setZipcode("999-999");
        address.setGeo(createDefaultGeo());
        return address;
    }

    private static Geo createDefaultGeo() {
        Geo geo = new Geo();
        geo.setLat("99");
        geo.setLng("199");
        return geo;
    }

    private static Company createDefaultCompany() {
        Company company = new Company();
        company.setName("Ukr Prog Bear");
        company.setCatchPhrase("forward");
        company.setBs("go");
        return company;
    }
}
