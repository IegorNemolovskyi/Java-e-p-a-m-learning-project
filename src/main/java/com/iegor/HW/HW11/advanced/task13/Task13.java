package com.iegor.HW.HW11.advanced.task13;

import com.iegor.HW.HW11.advanced.Entrant;
import com.iegor.HW.HW11.advanced.YearSchoolStat;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task13 {
    /**
     * Task 13.
     *
     * A sequence of data about applicants nameList of type Entrant and a sequence of integers yearList representing years are given.
     * Each element of the nameList sequence includes the fields <school_number> <year_of_entering> <last_name>.
     * Get data (a list of YearSchoolStat values) about the number of different schools that applicants graduated from,
     * for each year from the yearList. YearSchoolStat includes < year_of_entering> <number_of_schools> fields.
     * If in the given year of admission there are no applicants from the listed schools, indicate zero in the field < number_of_schools >.
     * The YearSchoolStat list must be sorted in ascending order by the number of schools, and for matching values,
     * in ascending order by the year number. For example:
     * input: { 2001, 1999, 2000, 2002, 2003 }
     *
     * { (11, 2003, "Ivanov"), (11, 2001, "Petrov"), (11, 2001, "Pupkin"), (10, 1999, "Zobkin"),
     * (10, 1999, "Zabkin"), (10, 1999, "Ivanov"), (10, 2000, "Petrov"), (14, 2001, "Pupkin"), (15, 2000, "Zobkin"),
     * (10, 2000, "Ivanov"), (12, 2003, "Petrov"), (11, 2003, "Pupkin"), (10, 2003, "Zobkin"), }
     * output: { (2002, 0), (1999, 1), (2000, 2) (2001, 2) (2003, 3) }
     *
     * @param nameList
     * @param yearList
     * @return
     */

    public static List<YearSchoolStat> getYearSchoolStatList(List<Entrant> nameList, List<Integer> yearList) {
        return yearList.stream()
                .map(year -> {
                    Set<Integer> numberOfSchools = new HashSet<>();
                    for (Entrant entrant : nameList) {
                        if (entrant.getYearOfEntering() == year) {
                            numberOfSchools.add(entrant.getSchoolNumber());
                        }
                    }
                    return new YearSchoolStat(year, numberOfSchools.size());

                })
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools).thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }
}