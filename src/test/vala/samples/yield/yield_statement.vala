async int yield_statement () {

    return yield yield_statement();
}

async void example_method_with_yield () {
    yield;
}