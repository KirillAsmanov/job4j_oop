package ru.job4j.oop.collections.passport;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 * 1. Паспорт и жители.[#245010]
 * @author Kirill Asmanov
 * @since 09.04.2020
 * @version 1.0.0;
 */
public class PassportOffice {
    /**
     * Содержит записи о жителях формата: ключ - номер паспорта, значение - объект Citizen
     */
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Добавляет новую запись в HashMap, если ее ключ еще не внесен в список
     * @param citizen - добавляемая запись
     * @return true - операция прошла успешно, false - запись с данным ключом уже существует
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!(citizens.containsKey(citizen.getPassport()))) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Находит в списке запист по ключу
     * @param passport - ключ
     * @return - значение записи
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}