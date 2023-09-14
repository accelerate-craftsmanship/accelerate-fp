import { expect, test } from 'vitest'
import { countSourceLines } from '../../../main/ts/ex_pure/CountSourceLines.js'

test('count lines in lipsum.txt is 120', () => {
    expect(countSourceLines('src/test/resources/ex_pure/lipsum.txt')).toBe(120)
})
