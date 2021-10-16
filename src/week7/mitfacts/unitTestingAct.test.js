var utils  = require('course-utilities');
var greet = utils.load('./unitTesttinAct.js', 'greet');

describe('test greet()', () => {
    it('should return with name', function () {
        expect(greet('Luca')).toBe("Hello, Luca");
    });
    it('should return Hello there', function () {
        expect(greet()).toBe("Hello, there");
    });
    it('should return all uppercase', function () {
        expect(greet("LUCA")).toBe("HELLO, LUCA");
    });
    it('should return greeting two people', function () {
        expect(greet(["Luca", "Miranda"])).toBe("Hello, Luca, Miranda");
    });
    it('should return greeting to as many as wanted', function () {
        expect(greet(["Luca", "Miranda", "a", "b", "c", "d"])).toBe("Hello, Luca, Miranda, a, b, c, d");
    });
});