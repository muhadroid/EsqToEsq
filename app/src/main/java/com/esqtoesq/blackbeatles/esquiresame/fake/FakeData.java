package com.esqtoesq.blackbeatles.esquiresame.fake;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.UUID;
import android.support.compat.R;

/**
 * Created by Mak on 13.05.2017.
 */

abstract class FakeData {
    static SecureRandom rnd = new SecureRandom();

    static ArrayList<String> avatars = new ArrayList<String>() {
        {
            add("http://i.obozrevatel.com/6/326233/gallery/812652.jpg");
            add("https://pp.userapi.com/c636920/v636920735/204d9/4mLJn9XAPQI.jpg");
            add("https://pp.userapi.com/c636920/v636920735/204d9/4mLJn9XAPQI.jpg");
            add("https://pp.userapi.com/c636920/v636920735/204d9/4mLJn9XAPQI.jpg");
        }
    };

    static final ArrayList<String> groupChatImages = new ArrayList<String>() {
        {
            add("https://pp.userapi.com/c636920/v636920735/204d9/4mLJn9XAPQI.jpg");
            add("https://pp.userapi.com/c631619/v631619735/8ceb/2ZjUCXTBnqg.jpg");
            add("https://pp.userapi.com/c636323/v636323558/5f41b/MsDDdB2YAyM.jpg");
        }
    };

    static final ArrayList<String> groupChatTitles = new ArrayList<String>() {
        {
            add("Уебок, Пидор");
            add("Гандон, Призерватив, Резинка");
            add("1,3,5,7");
        }
    };

    static final ArrayList<String> names = new ArrayList<String>() {
        {
            add("Александр");
            add("Иннокентий");
        }
    };

    static final ArrayList<String> messages = new ArrayList<String>() {
        {
            add("Здарова ебырь!");
            add("Отправь 6к - +1 (234) 567-89-01");
            add("Мое мыло - gandonyfree@durex.com");
            add("Смотри! Уебищный репозиторий www.github.com");
            add("Хаха ща сидим в офисе тут жара мы голвые");
            add("Джерри сегодня насрал, когда приедешь?");
        }
    };

    static final ArrayList<String> images = new ArrayList<String>() {
        {
            add("https://habrastorage.org/getpro/habr/post_images/e4b/067/b17/e4b067b17a3e414083f7420351db272b.jpg");
            add("http://www.designboom.com/wp-content/uploads/2015/11/stefano-boeri-architetti-vertical-forest-residential-tower-lausanne-switzerland-designboom-01.jpg");
        }
    };

    static String getRandomId() {
        return Long.toString(UUID.randomUUID().getLeastSignificantBits());
    }

    static String getRandomAvatar() {
        return avatars.get(rnd.nextInt(avatars.size()));
    }

    static String getRandomGroupChatImage() {
        return groupChatImages.get(rnd.nextInt(groupChatImages.size()));
    }

    static String getRandomGroupChatTitle() {
        return groupChatTitles.get(rnd.nextInt(groupChatTitles.size()));
    }

    static String getRandomName() {
        return names.get(rnd.nextInt(names.size()));
    }

    static String getRandomMessage() {
        return messages.get(rnd.nextInt(messages.size()));
    }

    static String getRandomImage() {
        return images.get(rnd.nextInt(images.size()));
    }

    static boolean getRandomBoolean() {
        return rnd.nextBoolean();
    }
}
