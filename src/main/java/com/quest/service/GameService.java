package com.quest.service;

import com.quest.model.Scene;

import java.util.HashMap;
import java.util.Map;

public class GameService {

    private Map<Integer, Scene> scenes = new HashMap<>();

    public GameService() {

        scenes.put(1,
                new Scene(
                        "Ввечері завітали Гендальф і компанія гномів. Що будете робити?",
                        "Пригостити гостей і вислухати все що  вони будуть казати і пропонувати",
                        "Відмовитись від усього і йти спати",
                        2,
                        3,
                        false,
                        false));

        scenes.put(2,
                new Scene(
                        "Вранці Ви прокинулись - а гості вже пішли, залишивши Вам повідомлення і Контракт найму",
                        "Зібрати речі і побігти наздоганяти всю цю веселу ватагу",
                        "Прибрати в норі і нікуди на йти з дому",
                        4,
                        3,
                        false,
                        false));

        scenes.put(3,
                new Scene(
                        "Ваша пригода так і не розпочалась. Шкода.",
                        "",
                        "",
                        0,
                        0,
                        true,
                        false));

        scenes.put(4,
                new Scene(
                        "Так! Ви зробили гарний вибір! Чи буде він вірним - час покаже, " +
                                "але те що це буде найцікавіша пригода у Вашому життя - беззаперечно!",
                        "",
                        "",
                        0,
                        0,
                        true,
                        true));
    }

    public Scene getScene(int id) {
        return scenes.get(id);
    }

    public int nextScene(int current, int choice) {

        Scene scene = scenes.get(current);

        if (choice == 1) {
            return scene.getNext1();
        } else {
            return scene.getNext2();
        }
    }
}