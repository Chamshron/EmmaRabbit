"use client";
import React, {useEffect, useState} from "react";
import Rabbit from "../../components/rabbit";

const RabbitContainer = () => {
    const [rabbits, setRabbits] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8080/rabbits")
        .then(res=>res.json())
        .then(data=>setRabbits(data))
    },[])
    console.log({rabbits})

    return(
        <span>
            <p className=" mt-10">Here is where the rabbits will be listed</p>
                <Rabbit rabbits={rabbits}/>
        </span>
    )
}
export default RabbitContainer;