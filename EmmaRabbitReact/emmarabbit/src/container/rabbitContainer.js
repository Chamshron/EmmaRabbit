"use client";
import React, {useEffect, useState} from "react";
import Request from "../helpers/request";

const RabbitContainer = () => {
    const [rabbits, setRabbits] = useState([]);

    useEffect(() => {
        const request = new Request();
        const rabbitPromise = request.get('/api/rabbits')
        Promise.all([rabbitPromise]).then((data) => {
            setRabbits(data[0])
        })
    }, [])
    return(
        <span>
            <p className=" mt-10">Here is where the rabbits will be listed</p>
        </span>
    )
}
export default RabbitContainer;