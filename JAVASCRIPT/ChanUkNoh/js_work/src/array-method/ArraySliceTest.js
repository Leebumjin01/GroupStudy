const ArraySliceTest = () => {
    let arr = [1, 2, 3, 4, 5, 6, 7]

    console.log("Before Slice = " + arr);

    let slicedArr = arr.slice(3)

    console.log("SlicedArr = " + slicedArr)

    console.log("After Slice = " + arr);

    arr = [1, 2, 3, 4, 5, 6, 7]

    console.log("Before Slice = " + arr);

    slicedArr = arr.slice(1)

    console.log("SlicedArr = " + slicedArr)

    console.log("After Slice = " + arr);

    return (
        <div className="ArraySliceTest">
            <p>
                ArraySliceTest
            </p>
        </div>
    )
}

export default ArraySliceTest