package domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class KwetterManagerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    //    @Test(expected = InvalidParameterException.class)
    @Test
    void creeerKweet() {

        Executable nameForgotten = () -> {
            Kweet baseKweet = new Kweet("", "vette shit bro", new Date(), new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>());
        };

        assertThrows(InvalidParameterException.class, nameForgotten, "name forgotten");
        Executable tooLongMessage = () -> {
            Kweet baseKweet = new Kweet("koen", "vette shit broabcdehjfshlfkjsdhljgslkjfdhgfjsdhflkjfhdslkjhflskdjhfljshdljfhlksjdhlkfjhsdljhflkjshdlkfjgsdhgfkdshagkafhdgskdhfbvbviauhegreguatehagshtgshdhfkdshgfakdhgdkjhsadgfkadshgkfhgsdkjhgfskfdkjhsdgkfhgbrugrursydgrsgfrskygfdskyfgrskdhrgfksdhgfdkjgruygfrskuygrkgfrygrskuygrfkuygfskyrgfsygfysgfygfkysdhgsdfhgshgfkjsgrkurgkfdgksjfkjgdfgdkhfgrksdgdrkugrekfukfudrgkrugdrsughrkgrdsgdkusdrlg", new Date(), new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>());
        };

        assertThrows(InvalidParameterException.class, tooLongMessage, "message too long");

    }
}