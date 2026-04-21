package yo.com.yo_edge_service.user;

import java.util.List;

public record User(
        String username,
        String firstname,
        String lastname,
        List<String> roles
) {}
