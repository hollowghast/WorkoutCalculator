describe('pow', function() {
    describe('raise to the 3rd', function() {
        function createTests(base) {
                let expected = base * base * base;
                it(`${base} to the 3rd is ${expected}`, function() {
                    assert.equal(pow(base, 3), expected);
                });
            }

            for (let base = 1; base <= 5; base++) {
                createTests(base);
            }
    });
    describe('raising to invalid exponent', function() {
        it('raises to a negative number', function() {
            assert.isNaN(pow(2, -1));
        });
        it('raises to a non-integer', function() {
            assert.isNaN(pow(2, 1.5));
        });
    });
});