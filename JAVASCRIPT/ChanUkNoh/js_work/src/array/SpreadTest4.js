const SpreadTest4 = () => {
    let arrStr = [..."xyz"]

    console.log(arrStr)

    function spreadArrPrint(a, b, c) {
        console.log("spreadArrPrint: " + a)
        console.log("spreadArrPrint: " + b)
        console.log("spreadArrPrint: " + c)
    }

    spreadArrPrint(...arrStr);

    return (
        <div className="SpreadTest4">
            <p>
                SpreadTest4
            </p>
        </div>
    )
}

export default SpreadTest4