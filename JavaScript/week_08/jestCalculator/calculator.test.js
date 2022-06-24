const {sum} = require('./calculator');

describe('addition functionality', ()=> {
    test(`can add two small positive numbers`, () => {
        // arrange - do any setup
        // act - call the function under test
        const actual = sum(2,3);
        // assert - call the assertion method
        const expected = 5;
        expect(actual).toBe(expected);
    });

    test('2 is even', () => {
        expect(isEven(2)).toBe(true);
    });
});


