struct Person {
    string first_name;
    string last_name;
}

public struct City {
    string name;
    uint32 population_size;
}

private struct Town {
    string name;
    uint32 population_size;
}

protected struct State {
    uchar[] abbreviation;
    string name;
    City[] cities;
}