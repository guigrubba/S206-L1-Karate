package aula_inatel.json_placeholder;

import com.intuit.karate.junit5.Karate;

class json_placeholder {
    
    @Karate.Test
    Karate testJsonPlaceholder() {
        return Karate.run("json_placeholder").relativeTo(getClass());
    }    

}
