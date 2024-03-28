"use client"
import React from 'react';

export default function Rabbit({rabbit}) {
  return (
    <div className='group mb-28 sm:mb-8 last:mb-0'>
        <section className='bg-indigo-100 max-w-[42rem] border border-black/5 rounded-lg overflow-hidden sm:pr-8 relative sm:h-[20rem] hover:bg-indigo-200 transition sm:group-even:pl-8'>
            <div className='pt-4 pb-7 px-5 sm:pl-10 sm:pr-2 sm:pt-10 sm:max-w-[50%] flex flex-col h-full sm:group-even:ml-[18rem]'>
                <div className=' text-2xl font-semibold'>
                    {rabbit.name}
                </div>
                <p className=' mt-5'>Lucky Emma Rabbit figurine from the  {rabbit.series} series with a {rabbit.odds} odds.</p>
                <div>
                    {rabbit.owned == false ? " I have this in my collection.": "Haven't found it yet."}

                </div>
            </div>
        </section>
    </div>
  )
}
