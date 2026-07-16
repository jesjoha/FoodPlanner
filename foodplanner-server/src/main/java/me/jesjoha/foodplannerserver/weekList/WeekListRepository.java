package me.jesjoha.foodplannerserver.weekList;

import java.util.List;

public interface WeekListRepository {

    List<WeekList> getAll();

    WeekList getById(int id);

    WeekList addWeekList(WeekList weekList);

    WeekList updateWeekList(int id, WeekList weekList);

    WeekList deleteWeekList(int id);
}
