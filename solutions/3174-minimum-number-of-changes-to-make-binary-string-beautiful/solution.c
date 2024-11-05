int minChanges(char* s) {
    int num_changes = 0;
    int length = strlen(s);  // Calculate length once and store it.

    for(int i = 0; i < length; i+=2) {
        if(s[i] != s[i + 1])
            num_changes++;
    }

    return num_changes;
}
