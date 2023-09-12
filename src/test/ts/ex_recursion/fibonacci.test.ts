import { expect, test } from 'vitest'
import { fibonacci } from '../../../main/ts/ex_recursion/fibonacci'

test('fibonacci sequence of length is 1, 1, 2, 3, 5, 8', () => {
    expect(fibonacci(6)).toStrictEqual([1, 1, 2, 3, 5, 8])
})
