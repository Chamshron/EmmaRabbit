"use client";
import React, {useEffect, useState} from "react";

const RabbitContainer = () => {
    const [rabbits, setRabbits] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8080/rabbits")
        .then(res=>res.json())
        .then(data=>setRabbits(data))
    },[])

    return(
        <span>
            <p className=" mt-10 font-bold">Here is where the rabbits will be listed</p>
                <ul>
                    {rabbits.map((rabbit, index) => (
                        <li 
                        key={index}
                        className=" font-bold"
                        >
                            {rabbit.name} 
                        </li>
                    ))}
                </ul>
        </span>
    )
}
export default RabbitContainer;