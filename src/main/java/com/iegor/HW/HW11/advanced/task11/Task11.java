package com.iegor.HW.HW11.advanced.task11;

import com.iegor.HW.HW11.advanced.Entrant;
import com.iegor.HW.HW11.advanced.YearSchoolStat;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task11 {
    /**
     *Task 11.
     *
     * A sequence of data about applicants nameList of type Entrant is given.
     * Each element of the sequence includes the fields <school_number> <year_of_entering> <last_name>
     * Get data (list of YearSchoolStat values) about the number of different schools that applicants graduated from
     * for each year present in the source data. The YearSchoolStat type includes the <year_of_entering>
     * <number_of_schools> fields. The list of YearSchoolStat values must be sorted in ascending order of the number
     * of schools, and for matching values, in ascending order of the year number.
     *
     * Look at the template on the end of the task before solving the problem. For example:
     * input: { (1, 1993, "Ivanov"), (2, 1992, "Petrov"), (3, 1993, "Pupkin"), (3, 2000, "Zobkin"), (3, 2000, "Zabkin") }
     * output: { YearSchoolStat{yearOfEntering=1992, numberOfSchools=1}, YearSchoolStat{yearOfEntering=2000, numberOfSchools=1}, YearSchoolStat{yearOfEntering=1993, numberOfSchools=2} }
     *
     * @param entrantList
     * @return
     */
    public static List<YearSchoolStat> getYearSchoolStats(List<Entrant> entrantList) {
        return entrantList
                .stream()
                .collect(Collectors.groupingBy(Entrant::getYearOfEntering))
                .keySet()
                .stream()
                .map(year -> {
                    Set<Integer> schoolNames = new HashSet<>();
                    for (Entrant entrant : entrantList) {
                        if (entrant.getYearOfEntering() == year)
                            schoolNames.add(entrant.getSchoolNumber());
                    }
                    return new YearSchoolStat(year, schoolNames.size());
                })
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools).thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }
}
